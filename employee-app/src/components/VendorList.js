import React, { useState, useEffect } from 'react';
import axios from 'axios';

const VendorList=()=> {
  const [vendors, setVendors] = useState([]);

  useEffect(() => {
    const fetchVendors = async () => {
      const response = await axios.get('/api/vendors/getAll');
      setVendors(response.data);
    };
    fetchVendors();
  }, []);

  return (
    <div>
      <h2>Vendors</h2>
      <ul>
        {vendors.map((vendor) => (
          <li key={vendor.email}>{vendor.name} - {vendor.email}</li>
        ))}
      </ul>
    </div>
  );
}

export default VendorList;
