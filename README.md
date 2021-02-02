# RaceCars
<hr>

![forthebadgeLicence](https://img.shields.io/github/license/JRybelis/RaceCars?color=red&style=flat-square)
![forthebadgeContributors](https://img.shields.io/github/contributors/JRybelis/RaceCars?style=flat-square) <br>
![forthebadgeJava](https://forthebadge.com/images/badges/made-with-java.svg) <br>
![forthebadgeOfficeSpace](https://forthebadge.com/images/badges/compatibility-pc-load-letter.svg)

> The project shows two console programs, which run a text-based 1000km car race. 
The first one uses arrays, while the second program employs objects. 
The first car to reach the 1000km mark wins, with the program printing the final 
results out. It also tracks and presents the leading racer every 100km of the 
race. 
<hr>

## Array-implemented race:
A number of race participants is set as a value of items in the array. Each item in the array (race car) goes through a _for_ loop cycle when its distance covered in that cycle (between 1km and 10km) is determined by a _Math.random_ method. Each time the first car passes a 1/10th of the race distance, the program logs the leader in the console output field: 
![Interval](https://github.com/JRybelis/RaceCars/blob/master/img/arraysRaceIntervals.png)

Whenever the first car crosses the 1000km mark in a loop cycle, all the other 
cars are also allowed to finish their cycle, and the car, which both crosses 
the finish line and travels the furthest past it in that cycle, wins:
| One car covers the 1000km distance and wins | Two cars cover the 1000km distance, the winner drove the furthest |
|----------------|----------------|
|![FinishClearLead](https://github.com/JRybelis/RaceCars/blob/master/img/arraysRaceFinish.png)|![FinishWithCloseSecond](https://github.com/JRybelis/RaceCars/blob/master/img/arraysRaceFinishClose.png)|

As soon as the winner is determined, the race finishes and the array items (race 
participants) are sorted descending, based on the distance they covered:

![FinalResults](https://github.com/JRybelis/RaceCars/blob/master/img/arraysRaceFinalResultsSortedDescending.png)

***

## Object-oriented race:
Two object classes are created: that of a RegularCar and of a SportsCar. 
The RegularCar class has the name, maxSpeed, distance, and speed parameters, 
along with methods for acceleration and braking while the SportsCar extends 
the RegularCar and also has a spoiler parameter, with a method to release and 
retract the spoiler. Both classes forbid the car objects to develop a negative 
speed, or to exceed their maximum speed.

All of the race participants (both RegularCar and SportsCar objects) cycle 
through a _for_ loop which determines whether they should accelerate, brake, or 
continue their current speed, using the _Math.random()_ method. Each loop cycle, 
racers have a 30% chance of braking, a 50% chance of accelerating, and a 20% 
chance of maintaining their previous speed. Sports cars also utilise their 
spoiler to increase their acceleration or braking, with 50% chance of success. 
The distance travelled is calculated by how much speed the car had per loop 
cycle. 

Each time a race participant crosses a 100km mark, the program prints out the 
interim results: 
![Interval]()

Whenever the first car crosses the 1000km mark in a loop cycle, all the other 
cars are also allowed to finish their cycle, and the car, which both crosses 
the finish line and travels the furthest past it in that cycle, wins:
| One car covers the 1000km distance and wins | Two cars cover the 1000km distance, the winner drove the furthest |
|----------------|----------------|
|![FinishClearLead]()|![FinishWithCloseSecond]()|

As soon as the winner is determined, the race finishes and the array items (race 
participants) are sorted descending, based on the distance they covered:

![FinalResults]()

***