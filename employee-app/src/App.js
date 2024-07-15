import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import EmployeeForm from './components/EmployeeForm';
import VendorForm from './components/VendorForm';
import EmailForm from './components/EmailForm';
import EmpList from './components/EmpList';
import VendorList from './components/VendorList';
import EmailList from './components/EmailList';
import './App.css';
import Home from './components/Home';
//import { Component } from 'react';

const App =() => {
  return (
    <Router>
      <div className="App">
        <Routes>
          <Route path="/new" element={<EmployeeForm/>}/>
          <Route path="/vendors/new"  element={<VendorForm/>} />
          <Route path="/emails/new" element={<EmailForm/>} />
          <Route path="/employees" element={<EmpList/>} />
          <Route path="/vendors" element={<VendorList/>} />
          <Route path="/emails" element={<EmailList/>} />
          <Route path="/" element={<Home/>} />
        </Routes>
      </div>
    </Router>
  );
}


export default App;

