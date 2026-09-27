import React from 'react';
import "./counter.css";
import React, { useState } from 'react';

const Counter = () => {

    const [count,setCount]=useState(0);
return (
    <div className='Counter-Conatiner'>
    <p id="para">u hAve clicked button {count} times</p>
    <button onClick={()=>{
        setCount(count+1)
    }}>click me</button>
    </div>
)
}

export default Counter
