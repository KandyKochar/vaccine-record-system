# Vaccine Record System

A Java file I/O application for reading, processing, and displaying vaccine records from text files.

## Overview
Manages patient vaccine records stored in a flat file format. Reads records from file, validates entries, and provides a report of vaccination status.

## Features
- File-based record reading and parsing
- Vaccine record validation
- Formatted output of vaccination status
- Error handling for missing or malformed records

## Technologies Used
- **Language:** Java (JDK 8+)
- **Concepts:** File I/O, exception handling, data parsing

## Project Structure
```
src/
+-- VaccineFileHandler.java   # File reading and record parsing
+-- Tester.java               # Main class demonstrating record processing
```

## Usage
```bash
javac src/*.java -d out/
java -cp out/ Tester
```

## Author
Kandy Kochar
