# ABROVIA – Regression Testing Report

## 1. Introduction

Regression testing is performed to ensure that existing application features continue to work correctly after code changes, bug fixes or configuration updates.

For ABROVIA, Maven and JUnit are used to re-execute automated backend tests.

## 2. Testing Environment

| Component | Details |
|---|---|
| Project | ABROVIA |
| Language | Java 17 |
| Framework | Spring Boot |
| Build Tool | Maven Wrapper |
| Testing Framework | JUnit |
| Database | H2 |
| Coverage Tool | JaCoCo 0.8.14 |

## 3. Regression Testing Procedure

The following command is used to clean the previous build and execute the automated test suite:

```powershell
cd C:\Users\Asus\Desktop\abroviaa\backend
.\mvnw.cmd clean test
```

The command performs the following operations:

1. Removes previously generated build files.
2. Compiles the application source code.
3. Compiles the test source code.
4. Executes the automated JUnit tests.
5. Generates the JaCoCo code coverage report.

## 4. Recorded Test Execution Results

The following results were obtained from the actual Maven execution shared during testing:

| Metric | Result |
|---|---:|
| Total tests executed | 13 |
| Failures | 0 |
| Errors | 0 |
| Skipped | 0 |
| Build status | SUCCESS |

## 5. Code Coverage After Test Execution

| Coverage Metric | Result |
|---|---:|
| Instruction Coverage | 72% |
| Branch Coverage | 50% |
| Line Coverage | 23 of 35 |
| Method Coverage | 13 of 19 |
| Class Coverage | 4 of 4 |

## 6. Regression Testing Observations

- The automated test suite completed successfully.
- No test failures or errors were reported.
- Enquiry validation and API operations were covered by automated tests.
- JaCoCo generated the coverage report successfully.
- Further regression runs should be performed whenever application code is modified.

## 7. Evidence

The following evidence should be maintained:

1. Screenshot of the Maven terminal output showing BUILD SUCCESS.
2. Screenshot of the JaCoCo coverage report.
3. JUnit test source files.
4. Maven test reports generated inside the backend target folder.

## 8. Conclusion

The recorded automated test execution completed successfully with 13 tests, zero failures, zero errors and zero skipped tests. The JaCoCo report showed 72% instruction coverage. These results provide initial regression-testing evidence for the ABROVIA backend. Additional regression testing will be required after future code changes.