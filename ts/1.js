// console.log("hello srk!")
var myTrip = {
    destination: "Paris",
    travelDate: new Date("2024-02-23"),
    returnDate: new Date("2024-03-02"),
    numberOfTravelers: 4
};
function display(i) {
    console.log("Travelling to: ".concat(i.destination));
    console.log("Travelling Date: ".concat(i.travelDate));
    console.log("Return Date: ".concat(i.returnDate));
    console.log("Number of Passengers: ".concat(i.numberOfTravelers));
}
display(myTrip);
