<!DOCTYPE html>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
    <h2>Welcome, <%= session.getAttribute("username") %>!</h2>
    <form action="logout" method="post">
        <button type="submit">Logout</button>
    </form>
</body>
</html>