import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    // List of all possible commands
    enum COMMANDS {
        DEPEND, INSTALL, REMOVE, LIST, END
    }

/* In Java, static is a keyword used to describe how objects are managed in memory.
It means that the static object belongs specifically to the class,
instead of instances of that class.
Variables, methods, and nested classes can be static.

*/
    static class Package {

        private String name; // Package name
        private List<Package> dependencies; // Package Dependencies
        private boolean installedAsDependency = false;

        public boolean isInstalledAsDependency(){
            return installedAsDependency;
        }
        public void setInstalledAsDependency(boolean installedAsDependency) {
            this.installedAsDependency = installedAsDependency;
        }
        // Constructor
        Package(String name) {
            this.name = name;
            dependencies = new ArrayList<>();
        }

        // Get all dependencies
        List<Package> getDependencies() {
            return dependencies;
        }
        // Add dependencies
        void addDependencies(Package dependency) {
            this.dependencies.add(dependency);
        }

        @Override
        public String toString() {
            return this.name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Package)) {
                return false;
            }
            Package pkg = (Package) o;
            return Objects.equals(name, pkg.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
    // List of installed packages
    private static List<Package> installedPkgs = new ArrayList<>();
    private static Map<String, Package> allPkgs = new HashMap<>();

/*
 * Complete the function below.
 */

    static void doIt(String[] input) {
        // Input is the list of commands
        for(String commands: input) {
            if (commands !=null) {
                System.out.println(commands);
                // Ex: DEPEND TELNET TCPIP NETCARD
                // Match sequence of one or more whitespace characters

            final String[] commandTokens = commands.split("\\s+");
            // Get the command string
            final String cmdToken = commandTokens[0]; // Ex: DEPEND which is a command
            final COMMANDS command = COMMANDS.valueOf(cmdToken.toUpperCase());
            switch(command) { // Possible Cases: DEPEND, INSTALL, REMOVE, LIST and END
                case DEPEND:
                    final String pkgName = commandTokens[1];
                    validateDependency(pkgName, commandTokens);
                    break;
                case INSTALL:
                    final Package installPackage = getPackage(commandTokens[1]);
                    if (isAlreadyInstalled(installPackage)) {
                        System.out.println(installPackage + " is already installed");
                    } else {
                        // Get all the dependencies and if not already installed, install each of them.
                        final List<Package> pkgDepsToBeInstalled = installPackage.getDependencies();
                        for (Package pkgDependency : pkgDepsToBeInstalled) {
                            if (!isAlreadyInstalled(pkgDependency)) {
                                pkgDependency.setInstalledAsDependency(true);
                                install(pkgDependency);
                            }
                        }
                        // Once all the nested dependencies are installed, install the current package
                        install(installPackage);
                    }
                    break;
                case REMOVE:
                    final Package removePackage = getPackage(commandTokens[1]);
                    // Check if it even installed or not
                    if(!isAlreadyInstalled(removePackage)) {
                        System.out.println(removePackage + " is not installed");
                    } else if(canRemovePackage(removePackage)) { // Check if the current package can be removed or not
                        System.out.println("Removing " + removePackage);
                        // Remove the package from installed packages
                        installedPkgs.remove(removePackage);

                        // Also remove the dependencies if valid
                        final List<Package> currDependencies = removePackage.getDependencies();
                        for (Package dependency : currDependencies) {
                            if (canRemovePackage(dependency) && dependency.isInstalledAsDependency()) {
                                System.out.println("Removing " + dependency);
                                installedPkgs.remove(dependency);
                            }
                    }
                } else {
                    // Package cannot be removed as it is still a dependency
                    System.out.println(removePackage + " is still needed");
                }
                break;
                case LIST:
                    // Print all the installed packages
                    for(Package pkg: installedPkgs) {
                        System.out.println(pkg);
                    }
                break;
              case END:
                break;
            }
        }
        }
    }

    // Method to validate the dependencies
    private static void validateDependency(String pkgName, String[] commandTokens) {
        // command tokens is a list of tokens  Ex: DEPEND TELNET TCPIP NETCARD
        // Check for nested dependencies starting at index 2 since first token is the command
        for (int i = 2; i < commandTokens.length; i++) {
            final String currentDependency = commandTokens[i];
            final List<Package> nestedDependency = getPackage(currentDependency).getDependencies();
            // If the current dependency contains the package, ignore the command
            if (nestedDependency != null && nestedDependency.contains(getPackage(pkgName))) {
                System.out.println(currentDependency + " depends on " + pkgName + ", ignoring command");
            } else { // Otherwise add it as new dependency.
                getPackage(pkgName).addDependencies(getPackage(currentDependency));
            }
        }
    }
    // Method to get the packge dependencies for the current package
    private static Package getPackage(String name) {
        Package pkg = allPkgs.get(name);
        // If the package not already available, create and add it to list of all packages
        if (pkg == null) {
            pkg = new Package(name);
            allPkgs.put(name, pkg);
        }
        return pkg;
    }
    // Method to add the packages to be installed
    public static void install(Package pkg) {
        System.out.println("Installing " + pkg);
        installedPkgs.add(pkg);
    }

// Method to check if the package is already installed
    public static boolean isAlreadyInstalled(Package pkg) {
         return installedPkgs.contains(pkg);
    }

// Check if the package can be removed
public static boolean canRemovePackage(Package pkg) {
    for  (Package installedPackages: installedPkgs) {
        // Get all the dependencies for the installed packages
        final List<Package> reqDeps = installedPackages.getDependencies();
        if(reqDeps != null){
            for(Package dependency:reqDeps) {
                if(pkg.equals(dependency)) {
                    return false; // The current package cannot be removed since there is a dependency
                }
            }
        }
    }
    return true; // If there are no dependencies, the package can be safely deleted.
}

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int _input_size = 0;
        _input_size = Integer.parseInt(in.nextLine().trim());
        String[] _input = new String[_input_size];
        String _input_item;
        for(int _input_i = 0; _input_i < _input_size; _input_i++) {
            try {
                _input_item = in.nextLine();
            } catch (Exception e) {
                _input_item = null;
            }
            _input[_input_i] = _input_item;
        }

        doIt(_input);

    }
}
