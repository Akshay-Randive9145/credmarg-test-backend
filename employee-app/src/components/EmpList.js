import React, { useState, useEffect } from 'react';
import axios from 'axios';
import { getEmployees } from './CommonApi';

const EmpList=()=> {
  const [employees, setEmployees] = useState([]);

  useEffect(() => {
    const fetchEmployees = async () => {
      const response = await axios.get(getEmployees);
      setEmployees(response.data);
    };
    fetchEmployees();
  }, []);

  return (
    <div>
      <h2>Employees</h2>
      <ul>
        {employees.map((employee) => (
          <li key={employee.email}>{employee.name} - {employee.designation}</li>
        ))}
      </ul>
    </div>
  );
}

export default EmpList;
