# ABROVIA – Software Testing Plan

## 1. Project Overview

**Project Name:** ABROVIA – Study Abroad Consultancy Platform  
**Testing Type:** Manual Testing, Unit Testing, Integration Testing and Regression Testing  
**Backend Technology:** Java 17, Spring Boot and Maven  
**Database:** H2 Database  
**Testing Framework:** JUnit and Spring Boot Test  
**Code Coverage Tool:** JaCoCo 0.8.14

ABROVIA is a study abroad consultancy platform that allows students to explore study destinations, view university information and submit enquiries.

## 2. Testing Objectives

- Verify that the application functions according to its requirements.
- Check that student enquiries can be submitted and retrieved.
- Validate input fields such as student name, email, country and course.
- Verify API operations, including saving, retrieving and deleting enquiries.
- Identify errors and improve application reliability.
- Measure code coverage using JaCoCo.

## 3. Scope of Testing

### In Scope
- Enquiry form validation.
- Student enquiry creation.
- Retrieving all enquiries.
- Deleting an existing enquiry.
- Backend API testing.
- Unit testing of the Enquiry entity.
- Integration testing of the EnquiryController.
- Regression testing after code changes.

### Out of Scope
- Real payment gateway transactions.
- Verification of live university admission data.
- Production-grade administrator authentication.
- Testing with a permanent production database.

## 4. Testing Environment

| Component | Technology |
|---|---|
| Programming Language | Java 17 |
| Backend Framework | Spring Boot |
| Build Tool | Maven Wrapper |
| Database | H2 |
| Testing Framework | JUnit |
| API Testing | MockMvc |
| Coverage Tool | JaCoCo 0.8.14 |
| IDE | Visual Studio Code |
| Deployment | Render |

## 5. Testing Approach

**Unit Testing:** Individual classes and validation rules are tested independently.

**Integration Testing:** The controller and repository are tested together using Spring Boot Test and MockMvc.

**Manual Testing:** Application pages and enquiry submission are checked through a web browser.

**Regression Testing:** Previously executed tests are run again after code changes to check that existing functionality still works.

**Smoke Testing:** Basic application and API availability are checked after deployment.

## 6. Entry Criteria

- Application source code is available.
- Java 17 and Maven Wrapper are configured.
- Required dependencies are available.
- Backend application can start successfully.

## 7. Exit Criteria

- All planned test cases have an execution status.
- Critical defects are resolved or documented.
- Automated tests execute successfully.
- Test results and coverage are recorded.
- Final testing summary is prepared.

## 8. Initial Automated Test Results

The following results were obtained from the actual Maven test execution:

| Metric | Result |
|---|---:|
| Total automated tests | 13 |
| Failures | 0 |
| Errors | 0 |
| Skipped | 0 |
| Build Status | SUCCESS |

## 9. JaCoCo Code Coverage Results

The JaCoCo report generated using version 0.8.14 showed:

| Coverage Metric | Result |
|---|---:|
| Instruction Coverage | 72% |
| Branch Coverage | 50% |
| Line Coverage | 23 of 35 lines |
| Method Coverage | 13 of 19 methods |
| Class Coverage | 4 of 4 classes |

**Observation:** The report shows that all four classes were analyzed and 72% of instructions were covered by the executed tests. Additional tests can improve coverage.

## 10. Test Deliverables

- Software Testing Plan.
- Minimum 30 documented test cases.
- JUnit test source files.
- Maven test execution results.
- JaCoCo HTML coverage report.
- Integration and manual testing evidence.
- Defect log.
- Final test summary report.

## 11. Conclusion

The initial automated testing of the ABROVIA backend completed successfully. The executed tests reported zero failures and zero errors. JaCoCo generated a code coverage report showing 72% instruction coverage. Further manual and non-functional testing will be performed to evaluate the remaining application features.