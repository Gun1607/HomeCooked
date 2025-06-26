import { useEffect, useState } from 'react';
import axios from 'axios';

export default function TiffinList() {
    const [tiffins, setTiffins] = useState([]);

    useEffect(() => {
        axios.get('http://localhost:8080/tiffins')
            .then(res => setTiffins(res.data))
            .catch(err => console.error(err));
    }, []);

    return (
        <div className="border p-4 rounded mb-4">
            <h2 className="text-lg font-bold mb-2">Available Tiffins</h2>
            {tiffins.map(t => (
                <div key={t.id} className="border p-2 mb-2 rounded">
                    <strong>{t.name}</strong> – ₹{t.pricePerMeal} – {t.location}<br />
                    Menu: {t.menu}
                </div>
            ))}
        </div>
    );
}
