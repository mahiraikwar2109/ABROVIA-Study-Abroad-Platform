
# ABROVIA – Cloud Security, Monitoring and Cost Estimation

## 1. Cloud Security

ABROVIA uses HTTPS-enabled Render URLs to protect communication between users and the hosted application.

Security measures and recommendations:

- HTTPS is enabled for frontend and backend communication.
- Spring Boot validation checks enquiry input.
- Application configuration can use environment variables.
- Passwords and API keys must not be committed to GitHub.
- Admin login is currently a demonstration feature and requires stronger authentication before production use.
- Database access should be restricted through appropriate credentials and permissions.

## 2. Data Encryption

### Encryption in Transit
HTTPS protects information while it travels between the user's browser and the application.

### Encryption at Rest
The current H2 in-memory database does not provide persistent storage. If a managed database is introduced, its encryption-at-rest feature should be enabled.

## 3. Identity and Access Management

Recommended access controls:

- Restrict Render dashboard access to authorised team members.
- Use role-based permissions for administrators.
- Keep deployment credentials private.
- Store sensitive configuration in environment variables.

Advanced role-based access control is a planned improvement.

## 4. Monitoring and Logging

Render provides:

- Deployment status.
- Application logs.
- Build logs.
- Runtime error information.

The backend health-check endpoint is:

https://abrovia-study-abroad-platform.onrender.com/api/hello

This endpoint helps verify whether the backend is responding.

## 5. Scalability Plan

If the number of users increases, ABROVIA can be improved by:

1. Increasing backend computing resources.
2. Running multiple backend instances.
3. Introducing a load balancer.
4. Migrating H2 to a managed database.
5. Adding caching for frequently accessed information.
6. Using object storage for uploaded documents and backups.

These are proposed improvements and are not all implemented in the current prototype.

## 6. Reliability and Backup Plan

The current H2 in-memory database loses its records when the application restarts.

Future reliability improvements:

- Use a persistent managed database.
- Schedule automated database backups.
- Test database restoration.
- Monitor application availability.
- Maintain a recovery procedure for deployment failures.

## 7. Object Storage Plan

The current prototype does not use a separate object storage service.

A service such as Amazon S3 or another compatible cloud object store could be introduced to store:

- Student documents.
- Application attachments.
- Database backup files.

This is a planned feature.

## 8. Monthly Cost Estimation

The following is an illustrative planning estimate, not a live Render quotation.

| Users per month | Expected hosting approach | Cost |
|---|---|---|
| 100 | Free-tier prototype, if eligible | ₹0 hosting target |
| 1,000 | Review resource usage; paid hosting may be needed | To be calculated |
| 10,000 | Scaled application, managed database and storage | To be calculated |

Actual cost depends on traffic, backend usage, database size, storage, bandwidth and the selected provider plans.

The free-tier estimate does not include guaranteed uptime or paid database and storage services.

## 9. Budget Management

- Use free-tier or student credits where eligible.
- Review usage and invoices regularly.
- Set budget alerts where supported.
- Stop unused services after demonstrations.
- Upgrade resources only when required.

## 10. Conclusion

ABROVIA has a working cloud deployment using Render and Docker.

HTTPS, deployment logs and a health-check endpoint are available. Persistent database storage, object storage, advanced access control, automated backups and production scaling remain future improvements.
