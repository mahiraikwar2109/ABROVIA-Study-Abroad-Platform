# ABROVIA – Defect Log

## 1. Project Details

**Project Name:** ABROVIA – Study Abroad Consultancy Platform  
**Module:** Backend and Web Application  
**Testing Environment:** Java 17, Spring Boot, Maven, H2 Database  
**Testing Tool:** JUnit, Spring Boot Test and JaCoCo

## 2. Defect Summary

During the initial automated testing, 13 tests were executed successfully with zero failures and zero errors.

| Description | Count |
|---|---:|
| Defects identified by executed automated tests | 0 |
| Critical defects | 0 |
| High-severity defects | 0 |
| Medium-severity defects | 0 |
| Low-severity defects | 0 |

**Note:** This records only the results of the automated tests executed so far. Manual testing is still pending, so this does not mean the entire application is defect-free.

## 3. Defect Details

No confirmed software defects were identified during the initial 13 automated test executions.

| Defect ID | Description | Severity | Status |
|---|---|---|---|
| — | No confirmed defects in executed automated tests | — | No defects recorded |

## 4. Known Project Limitations

The following are known limitations or areas requiring improvement. They are not confirmed defects from the executed test cases.

| ID | Limitation | Impact | Priority |
|---|---|---|---|
| L-01 | H2 database is configured as an in-memory database | Enquiry data may reset when the backend restarts | High |
| L-02 | Admin login uses demonstration credentials and client-side authentication | Not suitable for production security | High |
| L-03 | University information uses sample data | Information may not represent current real-world university details | Medium |
| L-04 | Payment gateway integration is not implemented | Online payments cannot be processed | Medium |
| L-05 | Additional manual and non-functional tests are pending | Complete application quality is not yet verified | Medium |

## 5. Defect Management Process

1. Identify an issue during testing.
2. Record the issue with a unique defect ID.
3. Describe the steps required to reproduce it.
4. Assign severity and priority.
5. Fix the issue in the source code.
6. Execute the relevant test again.
7. Perform regression testing.
8. Update the defect status.

## 6. Conclusion

The initial automated testing identified no confirmed defects. All 13 executed automated tests passed successfully. However, the application still has known limitations, and additional manual, security, performance and usability testing is required before considering it fully tested.