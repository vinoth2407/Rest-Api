import React, {useState} from "react";
import style from './review.css';
import axios from "axios";

function Display() {
    const url="http://localhost:8080/list"
    const [data, setData] = useState({
        eventName:"",
        startTime:"",
        endTime:""
    })

    function submit(e){
        const obj = {
            eventName:data.eventName,
            startTime:data.startTime,
            endTime:data.endTime
        }
        e.preventDefault();
        axios.post(url,obj)
        .then(res => {
            console.log(obj)
        })
    }

    function handle(e){
        const newdata={...data}
        newdata[e.target.id]=e.target.value
        setData(newdata)
        console.log(newdata)
    }
    return ( 
        
        <div className="main">
            <div className="form">
                <div>

                <h1>To Do List</h1>
                <form onSubmit={(e)=>submit(e)}>
                <div className="text-border">
                    <input onChange={(e)=> handle(e)}  type="text" id="eventName" value={data.eventName} placeholder="EventName"/>
                </div>
                <div className="text-border">
                    <input onChange={(e)=>{handle(e)}}type="time" id="startTime" 
                    value={data.startTime} placeholder="StartTime"/>
                </div>
                <div className="text-border">
                    <input onChange={(e)=>{handle(e)}}type="time" id="endTime" 
                    value={data.endTime} placeholder="EndTime"/>
                </div>
                
                <div className="but">
                <button>Submit</button>
                </div>
        </form>
                </div>
            </div>
        </div>
     );
}
export default Display;