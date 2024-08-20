// console.log("hello srk!")

interface TravelBooking {
    destination: string;
    travelDate: Date;
    returnDate: Date;
    numberOfTravelers: number;
}

const myTrip: TravelBooking = {
    destination: "Paris",
    travelDate: new Date("2024-02-23"),
    returnDate: new Date("2024-03-02"),
    numberOfTravelers: 4
};

function display(i:TravelBooking):void{
    console.log(`Travelling to: ${i.destination}`);
    console.log(`Travelling Date: ${i.travelDate}`);
    console.log(`Return Date: ${i.returnDate}`);
    console.log(`Number of Passengers: ${i.numberOfTravelers}`);
}

display(myTrip);