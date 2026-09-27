import React, { useState } from 'react';
import "./counter.css";

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
