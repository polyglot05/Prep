function marcsCakewalk(calorie) {
calorie.sort((b,a) => b-a);
let totalCalories = 0;
let index = 0;
for (let i = calorie.length - 1; i >= 0; i--) {
totalCalories += calorie[i] * Math.pow(2, index);
index++;
}
return totalCalories;
}


// To Run: Ex: let arr = [7, 4, 9, 6]; marcsCakewalk(arr);
