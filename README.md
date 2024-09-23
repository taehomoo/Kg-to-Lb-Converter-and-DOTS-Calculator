# Kg-to-Lb-Converter-and-DOTS-Calculator
## Project Overview
This Java-based GUI application allows users to:
- Convert between kilograms (Kg) and pounds (Lb).
- Calculate the DOTS score, a powerlifting coefficient used to compare the strength of lifters across different body weights and genders.
- The user can switch between these functionalities using buttons on the main menu. The application includes three main features: converting Kg to Lb, converting Lb to Kg, and 
  calculating DOTS scores.

## Features
- **Kg to Lb Converter:** Converts weight from kilograms to pounds.
- **Lb to Kg Converter:** Converts weight from pounds to kilograms.
- **DOTS Calculator:** Calculates a lifter’s DOTS score based on their body weight, total lifted, and gender (Male/Female).
  
## Project Structure
**Main Class:** kgToLbConverterDOTSCalculator.java - This contains the main GUI logic, which uses CardLayout to navigate between the different panels.
**Conversion Methods:** Helper methods kgToLbs(double) and lbsToKg(double) perform the unit conversions.
**DOTS Calculation:** The dotsCalculator(double, double, String) method calculates the DOTS score based on body weight, total lifted, and gender.

## How to Run
**Clone the repository:**

`git clone https://github.com/taehomoo/kg-lb-dots-calculator.git`

**Compile and run the program:**

`javac kgToLbConverterDOTSCalculator.java`

`java kgToLbConverterDOTSCalculator`

## Usage Instructions
- Launch the application.
- From the main menu, choose one of the following options:
- Kg to Lb: Enter the weight in kilograms, and the program will display the equivalent in pounds.
- Lb to Kg: Enter the weight in pounds, and the program will display the equivalent in kilograms.
- DOTS Calculator: Enter your gender (Male/Female), body weight, and total weight lifted, and the program will calculate your DOTS score.
- Menu Navigation: Use the "Menu" button on any panel to return to the main menu.

## Data Sources
- DOTS Formula found [here](https://www.powerlifting.sport/fileadmin/ipf/data/ipf-formula/Models_Evaluation-I-2020.pdf)
  
## Dependencies
- Java 8 or higher
- Java Swing for GUI components

## License
This project is licensed under the MIT License. See the LICENSE file for details.

