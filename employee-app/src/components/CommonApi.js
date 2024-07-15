import axios from 'axios';

const API_BASE_URL = 'http://localhost:8080/api';

export const createEmployee = (employees) => axios.post(`${API_BASE_URL}/add`, employees);
export const createVendor = (vendor) => axios.post(`${API_BASE_URL}/vendor`, vendor);
export const sendEmails = (vendors) => axios.post(`${API_BASE_URL}/emails`, { vendors });
export const getEmployees = () => axios.get(`${API_BASE_URL}/all`);
export const getVendors = () => axios.get(`${API_BASE_URL}/getAll`);
export const getEmails = () => axios.get(`${API_BASE_URL}/getEmail`);