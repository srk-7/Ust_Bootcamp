// Interfaces
interface User {
    name: string;
    dob: Date;
}

// BirthdayService Class
class BirthdayService {
    private users: User[];

    constructor() {
        this.users = [];
    }

    addUser(user: User) {
        this.users.push(user);
    }

    getUsers(): User[] {
        return this.users;
    }

    getBirthdaysByMonth(month: number): User[] {
        return this.users.filter(user => user.dob.getMonth() === month);
    }

    getBirthdaysByYear(year: number): User[] {
        return this.users.filter(user => user.dob.getFullYear() === year);
    }
}

// Initialize BirthdayService
const birthdayService = new BirthdayService();

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
birthdayService.addUser({ name: 'Srk', dob: new Date(2002, 2, 22) });
birthdayService.addUser({ name: 'Julia', dob: new Date(1991, 10, 3) }); // November 3, 1991
birthdayService.addUser({ name: 'Kevin', dob: new Date(2000, 10, 20) }); // November 20, 2000
birthdayService.addUser({ name: 'Laura', dob: new Date(2002, 11, 25) }); // December 25, 2000


// DOM elements
const monthSelect = document.getElementById('month') as HTMLSelectElement;
const yearInput = document.getElementById('year') as HTMLInputElement;
const filterBtn = document.getElementById('filterBtn') as HTMLButtonElement;
const birthdayList = document.getElementById('birthdayList') as HTMLDivElement;

// Event listener for filter button
filterBtn.addEventListener('click', () => {
    const monthValue = parseInt(monthSelect.value);
    const yearValue = parseInt(yearInput.value);

    let filteredUsers: User[] = birthdayService.getUsers();

    if (!isNaN(monthValue) && monthValue >= 0 && monthValue <= 11) {
        filteredUsers = birthdayService.getBirthdaysByMonth(monthValue);
    }

    if (!isNaN(yearValue) && yearValue > 0) {
        filteredUsers = birthdayService.getBirthdaysByYear(yearValue);
    }

    displayBirthdays(filteredUsers);
});

// Function to display birthdays
function displayBirthdays(users: User[]) {
    birthdayList.innerHTML = '';

    if (users.length === 0) {
        birthdayList.innerHTML = '<p>No birthdays found.</p>';
        return;
    }

    users.forEach(user => {
        const birthdayItem = document.createElement('div');
        birthdayItem.classList.add('birthday-item');
        birthdayItem.textContent = `${user.name} - ${user.dob.toLocaleDateString()}`;
        birthdayList.appendChild(birthdayItem);
    });
}

// Initial display of all birthdays
displayBirthdays(birthdayService.getUsers());