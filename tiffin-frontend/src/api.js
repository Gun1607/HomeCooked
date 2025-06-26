import axios from 'axios';

const BASE_URL = 'http://localhost:8080';

export const registerHousewife = (data) =>
    axios.post(`${BASE_URL}/register/housewife`, data);

export const registerBachelor = (data) =>
    axios.post(`${BASE_URL}/register/bachelor`, data);

export const getTiffins = () =>
    axios.get(`${BASE_URL}/tiffins`);

export const getTiffinsByLocation = (location) =>
    axios.get(`${BASE_URL}/tiffins/location/${location}`);

export const getMatches = (bachelorId) =>
    axios.get(`${BASE_URL}/order/match/${bachelorId}`);
