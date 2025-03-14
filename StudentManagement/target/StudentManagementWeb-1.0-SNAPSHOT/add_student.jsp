<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Students</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        h1 {
            color: #333;
        }
        input[type=text] {
        	width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 2px solid #000;
            border-radius: 4px;
            box-sizing: border-box;
        }
        input[type=number] {
        	width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 2px solid #000;
            border-radius: 4px;
            box-sizing: border-box;
        }
        
        input[type=submit],a {
          width: 100%;
          background-color: #4CAF50;
          color: white;
          padding: 14px 20px;
          margin: 8px 0;
          border: none;
          border-radius: 4px;
          cursor: pointer;
        }
        label {
        	display: block;
        	height: auto;
            padding: 3px;
            
        }
    </style>
</head>

<body>
    <h1>Add Students</h1>
    <form action="AddStudentServlet" method="post">
        <label>Name</label>
        <input type="text" name="name" required><br>
        <label>Age</label>
        <input type="number" name="age" required><br>
        <label>Course</label>
        <input type="text" name="course" required><br>
        <input type="submit" value="Add Student">
    </form>
    <a href="viewStudents">View Students</a>
</body>

</html>