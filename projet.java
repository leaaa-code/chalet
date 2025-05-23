// Handle the reservation form submission
document.getElementById('reservation-form').addEventListener('submit', function (e) {
  e.preventDefault(); // Prevent default form submission

  // Get form values
  const name = document.getElementById('name').value;
  const email = document.getElementById('email').value;
  const phone = document.getElementById('phone').value;
  const checkin = document.getElementById('checkin').value;
  const checkout = document.getElementById('checkout').value;
  const guests = document.getElementById('guests').value;

  // Basic form validation (you can expand this)
  if (!name || !email || !phone || !checkin || !checkout || !guests) {
    alert('Please fill in all fields.');
    return;
  }

  // Confirmation message
  const confirmationMsg = `Thank you, ${name}! Your reservation from ${checkin} to ${checkout} for ${guests} guests has been submitted. We will contact you shortly at ${email}.`;

  document.getElementById('confirmation').textContent = confirmationMsg;

  // Optionally, reset the form
  document.getElementById('reservation-form').reset();
});