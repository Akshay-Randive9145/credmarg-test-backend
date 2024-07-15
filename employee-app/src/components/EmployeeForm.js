import React, { useState } from 'react';
import { createEmployee } from './CommonApi';
import axios from 'axios';

const EmployeeForm=()=> {
  const [name, setName] = useState('');
  const [designation, setDesignation] = useState('');
  const [ctc, setCtc] = useState('');
  const [email, setEmail] = useState('');

  const handleSubmit = async (e) => {
    e.preventDefault();
    try{
    await axios.post(createEmployee, { name, designation, ctc, email });
    alert('Employee added!');
  }catch(error){
    console.error('There was an error adding the employee!', error);

  }
  };

  return (
    <form onSubmit={handleSubmit}>
      <h2>Add New Employee</h2>
      <label>
        Name:
        <input type="text" value={name} onChange={(e) => setName(e.target.value)} />
      </label>
      <label>
        Designation:
        <input type="text" value={designation} onChange={(e) => setDesignation(e.target.value)} />
      </label>
      <label>
        CTC:
        <input type="text" value={ctc} onChange={(e) => setCtc(e.target.value)} />
      </label>
      <label>
        Email:
        <input type="email" value={email} onChange={(e) => setEmail(e.target.value)} />
      </label>
      <button type="submit">Submit</button>
    </form>
  );
}

export default EmployeeForm;
