# Give me a Diamond
This application was written as a solution to the *Give me a Diamond* kata [published](https://www.codewars.com/kata/5503013e34137eeeaa001648) on the *Codewars* website.

This application will accept a positive odd number input by the user, and return a string of asterisks to represent a diamond.

## Installation and Setup
### Prerequisites
* [Java 21 or above](https://www.oracle.com/uk/java/technologies/downloads/)
* Access to command line interface / terminal

### Installation
1. Download `diamond.jar` from the `/out/artifacts/diamond_jar/` directory of this repository.
2. Move the downloaded file to another local directory on your device of your choosing.
3. Open your command line interface / terminal and navigate to the local location of `diamond.jar`.
4. Run the application with the following command:
> java -jar diamond.jar

## Usage
Once you have run the application with the command above, you will be shown the following text:

>So you want a diamond? The size must be provided as an odd positive number.
><br />
>Please enter the required diamond size and hit ENTER.

### Examples

#### Correct use

>So you want a diamond? The size must be provided as an odd positive number.
><br />
>Please enter the required diamond size and hit ENTER.
><br />
>7 <br />
>&nbsp;&nbsp;&nbsp;\*
><br />
>&nbsp;&nbsp;\***
><br />
>&nbsp;\*****
><br />
>\*******
><br />
>&nbsp;\*****
><br />
>&nbsp;&nbsp;\***
><br />
>&nbsp;&nbsp;&nbsp;\*

#### Invalid number input

>So you want a diamond? The size must be provided as an odd positive number.
><br />
>Please enter the required diamond size and hit ENTER.
><br />
>0 <br />
>You must provide diamond size as a positive odd integer.

#### Less than the minimum size

>So you want a diamond? The size must be provided as an odd positive number.
><br />
>Please enter the required diamond size and hit ENTER.
><br />
>1 <br />
>Too small. The smallest diamond possible is 3.

