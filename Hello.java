<html>
<head>
<title> registration form </title>
</head>
<body>
<div>
<form id='registration'>
<h2> Event Registration form </h2>
<label for = "name">First Name :</label>
<input type='text' id='name'></br></br>
<label for = "email">E-mail :</label>
<input type='email' id='email'></br></br>
<label for = "phone">phno :</label>
<input type='number' id='phone'></br></br>
<label for = "event">Select Event :</label>
<select id='event'>
<option value='workshop'>Workshop</option>
<option value='seminar'>Seminar</option>
<option value='courses'>courses</option>
</select></br></br>
<button type='submit'>Register</button>
</form>
<div class='message' id='message'></div>
</div>
<script>
const form=document.getElementById('form');
const form=document.getElementById('message');
form.addEventListener('submit',function(e)
{
const name=document.getElementById('name').value;
const event=document.getElementById('event').value;
message.textContent(` thankyou ${name} for registering in the ${event} event`)
});
</script>
</body>
</html>
