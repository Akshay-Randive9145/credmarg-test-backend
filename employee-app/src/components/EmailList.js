import React, { useState, useEffect } from 'react';
import axios from 'axios';

function EmailList() {
  const [emails, setEmails] = useState([]);

  useEffect(() => {
    const fetchEmails = async () => {
      const response = await axios.get('/api/emails');
      setEmails(response.data);
    };
    fetchEmails();
  }, []);

  return (
    <div>
      <h2>Sent Emails</h2>
      <ul>
        {emails.map((email, index) => (
          <li key={index}>
            To: {email.to} - Message: {email.message}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default EmailList;
