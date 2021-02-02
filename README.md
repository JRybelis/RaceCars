# RaceCars
<hr>

![forthebadgeLicence](https://img.shields.io/github/license/JRybelis/RaceCars?color=red&style=flat-square)
![forthebadgeContributors](https://img.shields.io/github/contributors/JRybelis/RaceCars?style=flat-square) <br>
![forthebadgeJava](https://forthebadge.com/images/badges/made-with-java.svg) <br>
![forthebadgeOfficeSpace](https://forthebadge.com/images/badges/compatibility-pc-load-letter.svg)

> The project shows two console programs, which run a text-based 1000km car race. The first one uses arrays, while the second program employs objects. 
The first car to reach the 1000km mark wins, with the program printing the final results out. It also tracks and presents the leading racer every 100km of the race. 
<hr>

## Array-implemented race:
A number of race participants is set as a value of items in the array. Each item in the array (race car) goes through a _for_ loop cycle when its distance covered in that cycle (between 1km and 10km) is determined by a _Math.random_ method. Each time the first car passes a 1/10th of the race distance, the program logs the leader in the console output field: 
![Interval](https://github.com/JRybelis/RaceCars/blob/master/img/arraysRaceIntervals.png)

Whenever the first car crosses the 1000km mark in a loop cycle, all the other cars are also allowed to finish their cycle, and the car, which both crosses the finish line and travels the furthest past it in that cycle, wins:
| One car covers the 1000km distance and wins | Two cars cover the 1000km distance, the winner drove the furthest |
|----------------|----------------|
|![FinishClearLead](https://github.com/JRybelis/RaceCars/blob/master/img/arraysRaceFinish.png)|![FinishWithCloseSecond](https://github.com/JRybelis/RaceCars/blob/master/img/arraysRaceFinishClose.png)|

As soon as the winner is determined, the race finishes and the array items (race participants) are sorted descending, based on the distance they covered:
![FinalResults](https://github.com/JRybelis/RaceCars/blob/master/img/arraysRaceFinalResultsSortedDescending.png)

***
