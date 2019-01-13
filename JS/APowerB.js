// Implement a power b
function pow(base, power) {
    if (power < 0) return 1 / pow(base, -power);
    var b = base, result = 1;
    while (power > 0) {
        if ((power & 1) != 0) {
            result *= b;
        }
        power >>= 1;
        b *= b;
    }
    return result;
}
