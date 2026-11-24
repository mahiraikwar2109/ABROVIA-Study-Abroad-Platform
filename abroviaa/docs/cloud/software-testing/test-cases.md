# ABROVIA – Software Test Cases

## Test Case Details

| Field | Description |
|---|---|
| Project | ABROVIA – Study Abroad Consultancy Platform |
| Module | Backend and Web Application |
| Testing Framework | JUnit and Spring Boot Test |
| Execution Environment | Java 17, Maven Wrapper, H2 |

## A. Automated Test Cases

These test cases correspond to the automated tests executed successfully using Maven.

| Test ID | Test Scenario | Expected Result | Actual Result | Status |
|---|---|---|---|---|
| TC-01 | Load Spring Boot application context | Application context loads successfully | Loaded successfully | Pass |
| TC-02 | Submit enquiry with valid details | Enquiry passes validation | Validation successful | Pass |
| TC-03 | Submit enquiry with blank student name | Validation rejects blank name | Rejected | Pass |
| TC-04 | Submit enquiry with invalid email | Validation rejects invalid email | Rejected | Pass |
| TC-05 | Submit enquiry with blank country | Validation rejects blank country | Rejected | Pass |
| TC-06 | Submit enquiry with blank course | Validation rejects blank course | Rejected | Pass |
| TC-07 | Submit enquiry with 100-character name | Name is accepted | Accepted | Pass |
| TC-08 | Submit enquiry with 101-character name | Name is rejected | Rejected | Pass |
| TC-09 | Save a valid enquiry through POST API | API saves the enquiry successfully | Saved successfully | Pass |
| TC-10 | Retrieve enquiries through GET API | API returns enquiry records | API response successful | Pass |
| TC-11 | Submit invalid email through API | API rejects invalid email | Rejected | Pass |
| TC-12 | Submit enquiry without student name | API rejects missing name | Rejected | Pass |
| TC-13 | Delete an existing enquiry | API deletes the enquiry | Deleted successfully | Pass |

## B. Additional Manual Test Cases

These cases were checked manually on the deployed application.

| Test ID | Test Scenario | Expected Result | Actual Result | Status |
|---|---|---|---|---|
| TC-14 | Open ABROVIA home page | Home page loads correctly | Homepage loaded successfully | Pass |
| TC-15 | Navigate to destination page | Destination page opens | Destination page opened successfully | Pass |
| TC-16 | Navigate to universities page | University page opens | University page opened successfully | Pass |
| TC-17 | Open login page | Login page opens correctly | Login page opened successfully | Pass |
| TC-18 | Open admin page | Admin page opens correctly | Admin page opened successfully | Pass |
| TC-19 | Submit enquiry with all valid fields | Enquiry is submitted successfully | Enquiry submitted successfully | Pass |
| TC-20 | Submit enquiry with empty name | Form displays validation error | Validation checked successfully | Pass |
| TC-21 | Submit enquiry with empty email | Form displays validation error | Validation checked successfully | Pass |
| TC-22 | Submit enquiry with invalid email format | Form rejects invalid email | Invalid email validation checked | Pass |
| TC-23 | Submit enquiry with empty country | Form displays validation error | Validation checked successfully | Pass |
| TC-24 | Submit enquiry with empty course | Form displays validation error | Validation checked successfully | Pass |
| TC-25 | Check backend health endpoint | Backend returns a successful response | Backend endpoint opened successfully | Pass |
| TC-26 | Retrieve enquiries when database is empty | API returns an empty collection | Checked successfully | Pass |
| TC-27 | Delete an enquiry using an unknown ID | API returns an enquiry-not-found response | Checked successfully | Pass |
| TC-28 | Refresh the deployed home page | Page loads without an application error | Page refreshed successfully | Pass |
| TC-29 | Open website on a mobile-sized screen | Content adjusts to screen size | Responsive layout checked successfully | Pass |
| TC-30 | Check website navigation links | Navigation links open their correct pages | Navigation links checked successfully | Pass |

## Test Execution Summary

| Category | Total |
|---|---:|
| Automated test cases passed | 13 |
| Manual test cases passed | 17 |
| Total test cases passed | 30 |
| Failed test cases | 0 |
| Pending test cases | 0 |
| Total documented test cases | 30 |

## Test Execution Observation

- All 13 automated test cases passed during Maven execution.
- Manual testing was performed on the deployed application.
- The frontend homepage and backend health endpoint opened successfully.
- The live enquiry form submission was successful.
- JaCoCo generated the code coverage report successfully.

## Conclusion

A total of 30 test cases were documented for the ABROVIA application. Thirteen automated test cases and seventeen manual test cases were recorded as passed, with zero failed and zero pending cases.

The automated Maven test execution completed successfully with zero failures and zero errors. JaCoCo reported 72% instruction coverage and 50% branch coverage.

The testing activities helped verify the basic functionality, enquiry validation, API operations, website navigation and deployment availability of the ABROVIA platform.