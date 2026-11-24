# ABROVIA – Smoke Testing Report

## 1. Objective

Smoke testing verifies that the deployed application and its essential services are accessible and responding correctly.

## 2. Backend Smoke Test

| Field | Details |
|---|---|
| Test ID | ST-01 |
| Test Scenario | Open the deployed backend health endpoint |
| URL | https://abrovia-study-abroad-platform.onrender.com/api/hello |
| Expected Result | Backend returns a successful response |
| Actual Result | Endpoint opened successfully |
| Status | PASS |

## 3. Frontend Smoke Test

| Field | Details |
|---|---|
| Test ID | ST-02 |
| Test Scenario | Open the deployed ABROVIA website |
| URL | https://abrovia-website.onrender.com |
| Expected Result | Homepage loads, navigation is visible and page displays without errors |
| Actual Result | All three checks passed |
| Status | PASS |

## 4. Testing Observations

- Backend health endpoint opened successfully.
- Frontend homepage loaded successfully.
- Navigation menu was visible.
- Website displayed without an error during the check.

## 5. Live Enquiry Submission Test

| Field | Details |
|---|---|
| Test ID | ST-03 |
| Test Scenario | Submit a student enquiry through the live website |
| Test Data | Test Student, teststudent@example.com, Australia, Bachelor of Information Technology |
| Expected Result | Enquiry should be submitted successfully |
| Actual Result | User confirmed successful submission |
| Status | PASS |

## 6. Conclusion

All three initial smoke tests passed:
- Backend health endpoint opened successfully.
- Frontend homepage and navigation displayed correctly.
- Live enquiry form submission was successful.

These results confirm that the basic deployed application functions were accessible during testing. Further functional, security and performance testing is still required.