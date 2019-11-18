# Card-and-Deck-Management-System
Java program allowing Users to sort and manage cards and decks for various Trading Card Games (TCG).

## Motivation
I have a personal passion for many TCGs, even though I may seem more casual and new than other players. The idea for a Card & Deck Management system (CDM) came to me when sorting my personal collection of cards for the seemingly millionth time as I was planning to make a new deck. Realizing with my skill as a software developer, that I could program a tool to sort and analyze my cards for the best structure or theme for a deck rather doing it by hand.

That's how CDM started as a way to manage, sort, and build Yu-Gi-Oh TCG decks based on a personal collection of cards. It stands out from other deck building applications by using cards from the User's personal collection, keeping aware of amount limitataions while searching for the highest supported theme or card type.

But I didn't stop there. When I realized the similarities between Yu-Gi-Oh's cards and decks to the other two popular TCGs that I also play, Magic the Gathering and Pokémon, I realized I could use the same CDM System structure for those TCGs as well. The final step is enabling a single User to have a collection within each TCG, similar to how I own cards from and play each TCG.

In short, Card & Deck Management System started as a way to make my Trading Card Game experience easier that I wish to share with others.

## Development & Features
CDM is still in the early stages of development, but listed below are the major goals planned currently.

* Fully planned ERD for a majority of card and deck functionalities of Yu-Gi-Oh normalized or prepared for future additions
* Fully planned ERD for a majority of card and deck functionalities of Magic the Gathering normalized or prepared for future additions
* Fully planned ERD for a majority of card and deck functionalities of Pokémon normalized or prepared for future additions
* Fully planned ERD for Users, their roles, and connections to the other TCG Databases
* Develop a deck building tool that searches cards within a collection, analyzes their properties while counting reoccuring values, and sorts by the property value most commonly found with a list of multiple results
* Develop a Web App interface for Users to manage their collections
* Deploy Security to protect personal information management and overseen by an Admin so that Users can interact with other Users and their collections

## Installation
* Clone the repo link using gitbash
* Find the SQL-Scripts folder, run all the files on your local MySQL instance

## Using CDM
To Run the project:
* Open the maven project in a Java IDE
* After doing a clean & build, run App.java
* Once the server is running properly, open a new tab in your web broswer directed to localhost:8080

Currently, there's not much working functionality. As features are completed, this section will be updated.
