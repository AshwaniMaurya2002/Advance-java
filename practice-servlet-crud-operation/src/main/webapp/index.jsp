<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Registration Form</title>
  <style>
    body {
      font-family: Arial;
      background: #f4f4f4;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
    }

    .form-container {
      background: white;
      padding: 25px;
      border-radius: 10px;
      width: 300px;
      box-shadow: 0 0 10px rgba(0,0,0,0.1);
    }

    input {
      width: 100%;
      padding: 10px;
      margin: 8px 0;
    }

    button {
      width: 100%;
      padding: 10px;
      background: #007BFF;
      color: white;
      border: none;
      cursor: pointer;
    }

    button:hover {
      background: #0056b3;
    }
  </style>
</head>
<body>

<div class="form-container">
  <h2>Register</h2>

  <form id="registerForm">
    <input type="text" placeholder="Full Name" required name="fullname">
    <input type="email" placeholder="Email" required name="email">
    <input type="password" placeholder="Password" required name="password">
    <button type="submit" >Submit</button>
  </form>
</div>

<script>
  document.getElementById("registerForm").addEventListener("submit", function(e) {
    e.preventDefault();
    alert("Form Submitted Successfully!");
  });
</script>

</body>
</html>