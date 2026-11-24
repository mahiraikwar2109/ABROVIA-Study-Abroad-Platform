# ABROVIA – Final Software Testing Summary Report

## 1. Project Information

| Field | Details |
|---|---|
| Project Name | ABROVIA – Study Abroad Consultancy Platform |
| Project Type | Web Application |
| Programming Language | Java 17 |
| Backend Framework | Spring Boot |
| Database | H2 Database |
| Testing Framework | JUnit and Spring Boot Test |
| Build Tool | Maven Wrapper |
| Code Coverage Tool | JaCoCo 0.8.14 |
| Deployment Platform | Render |

## 2. Testing Objectives

The main objectives of software testing were:

- Verify the functionality of the ABROVIA application.
- Check student enquiry submission and validation.
- Test backend API operations.
- Verify website navigation and page accessibility.
- Identify errors and improve application reliability.
- Measure code coverage using JaCoCo.

## 3. Test Execution Summary

| Testing Category | Total |
|---|---:|
| Automated test cases passed | 13 |
| Manual test cases passed | 17 |
| Total test cases | 30 |
| Failed test cases | 0 |
| Pending test cases | 0 |

## 4. Automated Testing Results

Automated tests were executed using Maven Wrapper.

Command used:

```powershell
.\mvnw.cmd clean test
```

Actual execution results:

| Metric | Result |
|---|---:|
| Tests executed | 13 |
| Failures | 0 |
| Errors | 0 |
| Skipped | 0 |
| Build Status | SUCCESS |

## 5. JaCoCo Code Coverage Results

The JaCoCo 0.8.14 report generated the following results:

| Coverage Metric | Result |
|---|---:|
| Instruction Coverage | 72% |
| Branch Coverage | 50% |
| Line Coverage | 23 of 35 |
| Method Coverage | 13 of 19 |
| Class Coverage | 4 of 4 |

The report indicates that 72% of the executable instructions were covered by the automated tests.

## 6. Testing Activities Performed

### Unit Testing
- Student enquiry validation.
- Blank field validation.
- Email format validation.
- Student name length validation.

### Integration Testing
- POST enquiry API.
- GET enquiries API.
- DELETE enquiry API.
- Invalid API input handling.

### Manual Testing
- Homepage and navigation.
- Destination and university pages.
- Login and admin pages.
- Enquiry form submission.
- Input validation.
- Responsive layout checks.

### Smoke Testing
- Backend health endpoint.
- Frontend homepage.
- Live enquiry submission.

### Regression Testing
- Automated tests executed again using Maven Wrapper.
- JaCoCo coverage report generated.

## 7. Known Project Limitations

- H2 database uses in-memory storage.
- Admin authentication is designed for demonstration purposes.
- University information uses sample data.
- Payment gateway integration is not implemented.
- Additional production-level security and performance testing may be required.

## 8. Testing Evidence

The following evidence is maintained in the project:

1. Maven test execution results.
2. JaCoCo HTML coverage report.
3. JUnit test source files.
4. Backend smoke test result.
5. Frontend smoke test result.
6. Enquiry submission test result.

## 9. Final Conclusion

The ABROVIA Study Abroad Consultancy Platform underwent automated and manual testing. A total of 30 test cases were documented, consisting of 13 automated tests and 17 manual tests.

The automated test execution completed successfully with zero failures and zero errors. The JaCoCo report showed 72% instruction coverage and 50% branch coverage.

The testing activities verified the application's basic functionality, enquiry validation, API operations, website navigation and deployment availability.

Overall, the testing process provided evidence of the basic functional reliability of the ABROVIA application.