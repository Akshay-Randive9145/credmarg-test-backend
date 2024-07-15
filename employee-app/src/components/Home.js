import React from "react";

const  Home=()=>{
    return (
      <div>
        <h1>Admin Dashboard</h1>
        <ul>
          <li><a href="/new">Add New Employee</a></li>
          <li><a href="/vendors/new">Add New Vendor</a></li>
          <li><a href="/emails/new">Send Email to Vendors</a></li>
          <li><a href="/employees">View Employees</a></li>
          <li><a href="/vendors">View Vendors</a></li>
          <li><a href="/emails">View Sent Emails</a></li>
        </ul>
      </div>
    );
  }
  export default Home;