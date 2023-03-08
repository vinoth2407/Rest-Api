import React, { useState, useEffect } from "react";
import axios from "axios";

function Update() {
  const url="http://localhost:8080/list"
  const[eventId,setEventId]=useState();
  const[eventName,setEventName]=useState();
  const[startTime,setStartTime]=useState();
  const[endTime,setEndTime]=useState();
  const [myData, setMyData] = useState([]);
  const [isError, setIsError] = useState("");
  async function validate(e){
   
    const length = Object.keys(myData).length;
    let f=0;
    for (let i = 0; i < length; i++) {
      // console.log(myData[i].roll);
      
      if(Number(eventId)===myData[i].eventId){
            f=1;
            try {
                await axios.put("http://localhost:8080/list",
                    {

                        eventId: eventId,
                        eventName: eventName,
                        startTime: startTime,
                        endTime: endTime

                    });
                alert("Event updated Successfully");
                setEventId();
                setEventName();
                setStartTime();
                setEndTime();

            }
            catch (err) {
                alert("User Registation Failed");
            }
        }
        }
        if(f===0){
            alert('User Does Not Exists');
        }
    }
    
    useEffect(() => {
      axios.get("http://localhost:8080/list")
          .then((response) => {
              console.log(response.data)
              setMyData(response.data)
          })
          .catch((error) => setIsError(error.message));
  }, []);

  return (
    <>
      <div className="text-border">
        <input type="number" placeholder="Enter Id"
        onChange={(e) => setEventId(e.target.value)}
        value={eventId}
        />
        </div>
        <div className="text-border">
        <input
          type="text"
          id="eventName"
          onChange={(e) => setEventName(e.target.value)}
        value={eventName}
          placeholder="EventName"
        />
      </div>
      <div className="text-border">
        <input
          type="time"
          id="startTime"
          onChange={(e) => setStartTime(e.target.value)}
        value={startTime}
          placeholder="StartTime"
        />
      </div>
      <div className="text-border">
        <input
          type="time"
          id="endTime"
          onChange={(e) => setEndTime(e.target.value)}
          value={endTime}
          placeholder="EndTime"
        /><br></br>
        <button type="submit" onClick={validate}>submit</button>
      </div>
    </>
  );
}

export default Update;
