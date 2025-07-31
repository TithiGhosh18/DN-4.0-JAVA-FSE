import React from 'react';

function SyntheticButton() {
  const handleClick = (event) => {
    alert('I was clicked');
    // event is a SyntheticEvent
  };

  return (
    <button onClick={handleClick}>OnPress</button>
  );
}

export default SyntheticButton;