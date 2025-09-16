function showCourses() {
    fetch("http://localhost:8080/courses")
        .then(response => response.json())
        .then(courses => {
            const dataTable = document.getElementById("courseTable");
            let rows = ""; // build rows in one go

            courses.forEach(course => {
                rows += `
                    <tr>
                        <td>${course.courseId}</td>
                        <td>${course.courseName}</td>
                        <td>${course.trainer}</td>
                        <td>${course.durationInWeeks}</td>
                    </tr>
                `;
            });

            dataTable.innerHTML += rows;
        })
        .catch(error => console.error("Error fetching courses:", error));
}


function showStudentTable() {
    fetch("http://localhost:8080/courses/enrolled")
        .then(response => response.json())
        .then(students => {
            const studentList = document.getElementById("studentTable");
            let rows = "";

            students.forEach(student => {
                rows += `
                    <tr>
                        <td>${student.name}</td>
                        <td>${student.mailId}</td>
                        <td>${student.courseRegistered}</td>
                    </tr>
                `;
            });

            studentList.innerHTML += rows;
        })
        .catch(error => {
            console.error("Error fetching courses:", error);
        });
}
