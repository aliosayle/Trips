# Trips
Java program that includes an interface, an abstract class and subclasses which includes tools for managing data for different types of trips
Implement all the below classes:
A. The interface Economical has one method: economize().
B. The Trip class is characterized by three data fields: a String departureCity representing the trip’s departure city,
a String arrivalCity representing the trip’s arrival city and a double basicPrice representing the basic price of a
trip. This class has:
• A constructor that initializes all the attributes. An IllegalArgumentException must be thrown if the basic
price is negative
• The getter/setter methods for the attributes (must be implemented).
• An abstract method calculateCost().

<<Interface>>
Economical
+ economize(): void

Trip
- departureCity: String
- arrivalCity: String
- basicPrice: double
+ Trip(dc: String, ac: String, bp: double)
+ getters and setters
+ calculateCost(): double

Flight

- seatClass: String
+ Flight( dc: String, ac: String, bp: double, seatClass: String)
+ toString( ): String

TrainTrip

- isVIP: Boolean
+ TrainTrip(dc: String, ac: String, bp: double, isVIP: boolean)
+ toString( ): String

C. The TrainTrip class is characterized by a boolean isVIP. This class has:
• A constructor that initializes all the attributes.
• DO NOT IMPLEMENT GETTERS AND SETTERS FOR THIS CLASS.
• A toString( ) method that returns a description of the flight in the form:
A train trip departing from Paris to Barcelona for a basic price of 270$.
It is a VIP reservation.
• The cost of a train trip is its basic price, plus 100$ in case of a VIP reservation.
• A train trip is economized by making the reservation not VIP.
D. The Flight class is characterized by a String data field seatClass. This class has:
• A constructor that initializes all the attributes. If the seat class was not “First Class” nor “Economic” an
IllegalArgumentException must be thrown.
• DO NOT IMPLEMENT GETTERS AND SETTERS FOR THIS CLASS.
• A toString( ) method that returns a description of the flight in the form:
A flight departing from Beirut to Paris for a basic price of 650$. The
seat class reserved for this flight is economic.
• The cost of a flight is its basic price if the seat class is Economic and is its basic price * 2.5 if the seat class is
First class.
• A flight is economized by making its seatClass as “Economic”.
E. The Ticket class is characterized by one String instance data field ticketNumber, and one static integer data field
ticketsCounter. This class has:
• A no-arg constructor that increments ticketsCounter by one, creates the trips arraylist, and generates a ticket
number by concatenating the string “TN” with the current ticketsCounter.
• DO NOT IMPLEMENT GETTERS AND SETTERS FOR THIS CLASS.
• A method addTrip(t: Trip) that adds a trip to the set of trips of this ticket.
• A method reduceCost() that calls the economize method on every trip that could be economized.
• A toString() method that returns a description about the ticket containing all its information and the
information of its trips in the form:
The ticket TN312 covers the following trips:
1. A flight departing from Beirut to Paris for a basic price of 650$. The
seat class reserved for this flight is economic.
2. A train trip departing from Paris to Barcelona for a basic price of
270$. It is a VIP reservation.
F. Create a test program (application) in which you:
a. Create a ticket object.
b. Add to the ticket a VIP train trip from Prague to Vienna for a basic price of 50$.
c. Add to the ticket another non-VIP train trip from Vienna to Venice for a basic price of 70$.
d. Add to the ticket a first-class flight from Venice to Madrid for a basic price of 170$.
e. Display total cost of the ticket.
f. Reduce the cost of the ticket.
g. Display again the total cost of the ticket.
