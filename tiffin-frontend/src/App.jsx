import BachelorForm from './components/BachelorForm';
import HousewifeForm from './components/HousewifeForm';
import TiffinList from './components/TiffinList';
import MatchResult from './components/MatchResult';

export default function App() {
    return (
        <div className="max-w-2xl mx-auto p-4 space-y-6">
            <h1 className="text-3xl font-bold text-center mb-6">
                🥗 Tiffin Management System
            </h1>
            <HousewifeForm />
            <BachelorForm />
            <TiffinList />
            <MatchResult />
        </div>
    );
}
