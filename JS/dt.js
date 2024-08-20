// function greet(name){
// 	console.log("Hi! "+name);
// }
// greet("Srk");

// const cal = (items) => {
// 	return items.reduce((total, item) => total + item.price * item.quantity, 0);
// };

// const cart = [
// 	{
// 		name: 'lap', price: 1000, quantity: 4
// 	},
// 	{
// 		name: 'mob', price: 1000, quantity: 4
// 	}	
// ];

// console.log(cal(cart));


// const numbers = [1, 3, 4, 5, 6, 4, 6, 9, 8];

// const nonDuplicates = numbers.reduce((acc, num) => {
//     if (!acc.includes(num)) {
//         acc.push(num);
//     }
//     return acc;
// }, []);

// console.log(nonDuplicates);


//design a application using javascript script and rest operator that collecting the invoices from different companies calculate the total amount for a particular month.

const inovicea = [
    { company: 'A', amount: 1000, month: 'July' },
    { company: 'B', amount: 1500, month: 'July' }
];

const invoiceb = [
    { company: 'B', amount: 1500, month: 'June' },
    { company: 'C', amount: 800, month: 'August' }
];

const combi = (inovicea, ...invoiceb) =>{
	return [...inovicea,...invoiceb];
}

const calformonth = (month, ...invoicesa) => {
	const cal = invoicesa.filter(
		invoice=>invoice.month===month
	)
	const total=cal.reduce((acc,invoice)=>acc+invoice.amount,0)
	return total;
}

const totalJulyAmount = calformonth('July', ...inovicea);
console.log(totalJulyAmount);