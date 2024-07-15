import React, { useState } from 'react';
import axios from 'axios';

const VendorForm=()=> {
  const [name, setName] = useState('');
  const [email, setEmail] = useState('');
  const [upi, setUpi] = useState('');

  const handleSubmit = async (e) => {
    e.preventDefault();
    await axios.post('/api/vendors/vendor', { name, email, upi });
    alert('Vendor added!');
  };

  return (
    <form onSubmit={handleSubmit}>
      <h2>Add New Vendor</h2>
      <label>
        Name:
        <input type="text" value={name} onChange={(e) => setName(e.target.value)} />
      </label>
      <label>
        Email:
        <input type="email" value={email} onChange={(e) => setEmail(e.target.value)} />
      </label>
      <label>
        UPI:
        <input type="text" value={upi} onChange={(e) => setUpi(e.target.value)} />
      </label>
      <button type="submit">Submit</button>
    </form>
  );
}

export default VendorForm;
