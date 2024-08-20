// BirthdayService Class
var BirthdayService = /** @class */ (function () {
    function BirthdayService() {
        this.users = [];
    }
    BirthdayService.prototype.addUser = function (user) {
        this.users.push(user);
    };
    BirthdayService.prototype.getUsers = function () {
        return this.users;
    };
    BirthdayService.prototype.getBirthdaysByMonth = function (month) {
        return this.users.filter(function (user) { return user.dob.getMonth() === month; });
    };
    BirthdayService.prototype.getBirthdaysByYear = function (year) {
        return this.users.filter(function (user) { return user.dob.getFullYear() === year; });
    };
    return BirthdayService;
}());
// Initialize BirthdayService
var birthdayService = new BirthdayService();
// Dummy data (replace with actual data or database integration)
birthdayService.addUser({ name: 'Alice', dob: new Date(1990, 5, 15) }); // June 15, 1990
birthdayService.addUser({ name: 'Bob', dob: new Date(1985, 11, 25) }); // December 25, 1985
birthdayService.addUser({ name: 'Charlie', dob: new Date(1995, 2, 10) }); // March 10, 1995
birthdayService.addUser({ name: 'David', dob: new Date(1988, 7, 5) }); // August 5, 1988
birthdayService.addUser({ name: 'Emma', dob: new Date(1992, 0, 30) }); // January 30, 1992
birthdayService.addUser({ name: 'Frank', dob: new Date(1983, 4, 18) }); // May 18, 1983
birthdayService.addUser({ name: 'Grace', dob: new Date(1997, 8, 22) }); // September 22, 1997
birthdayService.addUser({ name: 'Hannah', dob: new Date(1989, 3, 12) }); // April 12, 1989
birthdayService.addUser({ name: 'Ian', dob: new Date(1993, 6, 8) }); // July 8, 1993
birthdayService.addUser({ name: 'Julia', dob: new Date(1991, 10, 3) }); // November 3, 1991
birthdayService.addUser({ name: 'Kevin', dob: new Date(2000, 10, 20) }); // November 20, 2000
birthdayService.addUser({ name: 'Laura', dob: new Date(2000, 11, 25) }); // December 25, 2000
// DOM elements
var monthSelect = document.getElementById('month');
var yearInput = document.getElementById('year');
var filterBtn = document.getElementById('filterBtn');
var birthdayList = document.getElementById('birthdayList');
// Event listener for filter button
filterBtn.addEventListener('click', function () {
    var monthValue = parseInt(monthSelect.value);
    var yearValue = parseInt(yearInput.value);
    var filteredUsers = birthdayService.getUsers();
    if (!isNaN(monthValue) && monthValue >= 0 && monthValue <= 11) {
        filteredUsers = birthdayService.getBirthdaysByMonth(monthValue);
    }
    if (!isNaN(yearValue) && yearValue > 0) {
        filteredUsers = birthdayService.getBirthdaysByYear(yearValue);
    }
    displayBirthdays(filteredUsers);
});
// Function to display birthdays
function displayBirthdays(users) {
    birthdayList.innerHTML = '';
    if (users.length === 0) {
        birthdayList.innerHTML = '<p>No birthdays found.</p>';
        return;
    }
    users.forEach(function (user) {
        var birthdayItem = document.createElement('div');
        birthdayItem.classList.add('birthday-item');
        birthdayItem.textContent = "".concat(user.name, " - ").concat(user.dob.toLocaleDateString());
        birthdayList.appendChild(birthdayItem);
    });
}
// Initial display of all birthdays
displayBirthdays(birthdayService.getUsers());
