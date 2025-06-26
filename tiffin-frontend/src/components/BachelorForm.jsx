import { useState } from 'react';
import axios from 'axios';

export default function BachelorForm() {
    const [form, setForm] = useState({
        name: '', email: '', phone: '', preferredLocation: ''
    });

    const handleChange = (e) => {
        setForm({ ...form, [e.target.name]: e.target.value });
    };

    const handleSubmit = async (e) => {
        e.preventDefault();
        await axios.post('http://localhost:8080/register/bachelor', form);
        alert('Bachelor registered successfully!');
        setForm({ name: '', email: '', phone: '', preferredLocation: '' });
    };

    return (
        <form onSubmit={handleSubmit} className="border p-4 rounded mb-4">
            <h2 className="text-lg font-bold mb-2">Register Bachelor</h2>
            {["name", "email", "phone", "preferredLocation"].map((field) => (
                <input
                    key={field}
                    type="text"
                    name={field}
                    placeholder={field}
                    value={form[field]}
                    onChange={handleChange}
                    className="block w-full mb-2 p-2 border rounded"
                />
            ))}
            <button className="bg-green-600 text-white px-4 py-2 rounded">Submit</button>
        </form>
    );
}
