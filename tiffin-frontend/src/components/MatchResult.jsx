import { useState } from 'react';
import axios from 'axios';

export default function MatchResult() {
    const [bachelorId, setBachelorId] = useState('');
    const [matches, setMatches] = useState([]);

    const fetchMatches = async () => {
        try {
            const res = await axios.get(`http://localhost:8080/order/match/${bachelorId}`);
            setMatches(res.data);
        } catch (err) {
            alert('Error fetching matches');
        }
    };

    return (
        <div className="border p-4 rounded mb-4">
            <h2 className="text-lg font-bold mb-2">Find Matching Tiffins</h2>
            <input
                type="number"
                placeholder="Enter Bachelor ID"
                value={bachelorId}
                onChange={(e) => setBachelorId(e.target.value)}
                className="block w-full mb-2 p-2 border rounded"
            />
            <button onClick={fetchMatches} className="bg-purple-600 text-white px-4 py-2 rounded mb-4">
                Get Matches
            </button>

            {matches.map((m, idx) => (
                <div key={idx} className="border p-2 mb-2 rounded">
                    <strong>{m.name}</strong> – ₹{m.pricePerMeal} – {m.location}<br />
                    Menu: {m.menu}
                </div>
            ))}
        </div>
    );
}
