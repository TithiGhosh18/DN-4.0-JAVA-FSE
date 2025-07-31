import React from 'react';
import ListOfPlayers from './Components/ListOfPlayers';
import IndianPlayers from './Components/IndianPlayers';

function App() {
  const flag = false; // Change to false to switch component

  return (
    <div className="App">
      <h1>Cricket App</h1>
      {flag ? <ListOfPlayers /> : <IndianPlayers />}
    </div>
  );
}

export default App;
