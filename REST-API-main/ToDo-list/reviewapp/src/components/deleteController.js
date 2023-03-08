import axios from 'axios';
import React, { useState, useEffect } from 'react';

function Delete() {
    const[id,setId]=useState();
    return ( <>

        <input type='number' placeholder="Enter the Id" value={id} onChange={(e)=>setId(e.target.value)}/>
        <br></br>
        <button onClick={()=>{
            axios.delete(`http://localhost:8080/list/${id}`)
            .then((rep)=>{
                alert(rep.data)
            })
        }}>submit</button>
        </>
    
    );
}

export default Delete;