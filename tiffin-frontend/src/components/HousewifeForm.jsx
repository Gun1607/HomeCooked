import { useState } from 'react';
import axios from 'axios';

export default function HousewifeForm() {
    const [form, setForm] = useState({
        name: '',
        email: '',
        phone: '',
        location: '',
        menu: '',
        pricePerMeal: ''
    });

    const handleChange = (e) => {
        setForm({ ...form, [e.target.name]: e.target.value });
    };

    const handleSubmit = async (e) => {
        e.preventDefault();
        console.log("Submitting form:", form);

        try {
            const response = await axios.post(
                'http://localhost:8080/register/housewife',
                form,
                { headers: { 'Content-Type': 'application/json' } }
            );
            console.log('Response:', response.data);
            alert('Housewife registered successfully!');
            setForm({
                name: '',
                email: '',
                phone: '',
                location: '',
                menu: '',
                pricePerMeal: ''
            });
        } catch (error) {
            console.error('Error submitting form:', error.response || error.message);
            alert('Failed to register. Check console for details.');
        }
    };

    return (
        <form onSubmit={handleSubmit} className="max-w-md mx-auto p-4 border rounded shadow">
            <h2 className="text-2xl font-bold mb-4 text-center">Register Housewife</h2>
            {['name', 'email', 'phone', 'location', 'menu', 'pricePerMeal'].map((field) => (
                <input
                    key={field}
                    type={field === 'pricePerMeal' ? 'number' : 'text'}
                    name={field}
                    value={form[field]}
                    onChange={handleChange}
                    placeholder={field.charAt(0).toUpperCase() + field.slice(1)}
                    className="w-full mb-3 p-2 border rounded"
                    required
                />
            ))}
            <button
                type="submit"
                className="w-full bg-green-600 text-white py-2 rounded hover:bg-green-700 transition"
            >
                Submit
            </button>
        </form>
    );
}
