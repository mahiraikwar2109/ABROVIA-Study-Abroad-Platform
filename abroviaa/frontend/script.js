
const enquiryForm = document.getElementById("enquiryForm");

if (enquiryForm) {
    enquiryForm.addEventListener("submit", async function(event) {
        event.preventDefault();

        const name = document.getElementById("studentName").value.trim();
        const email = document.getElementById("studentEmail").value.trim();
        const country = document.getElementById("country").value;
        const course = document.getElementById("course").value.trim();

        const enquiry = {
            studentName: name,
            email: email,
            country: country,
            course: course
        };

        const message = document.getElementById("formMessage");
        message.textContent = "Submitting your enquiry...";

        try {
            const response = await fetch("http://localhost:8080/api/enquiries", {
                method: "POST",
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify(enquiry)
            });

            if (!response.ok) {
                throw new Error("Failed to save enquiry");
            }

            message.textContent =
                "Thank you, " + name + "! Your enquiry has been saved successfully.";

            enquiryForm.reset();

        } catch (error) {
            message.textContent =
                "Unable to submit enquiry. Please try again.";
            console.error(error);
        }
    });
}
