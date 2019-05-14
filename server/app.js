const bodyParser = require('body-parser');
const jwt = require('jsonwebtoken');
const expressJwt = require('express-jwt');
const express=require('express');
var path = require('path');

var mongoose = require("mongoose");
mongoose.Promise = global.Promise;mongoose.connect("mongodb://localhost:27017/userdb");


app=express();

var nameSchema = new mongoose.Schema({
  firstname: String,
  lastname: String,
  username:String,
  password:String
 });
 var User = mongoose.model("User", nameSchema);
var cors = require('cors')


app.use(cors())
app.use(bodyParser.urlencoded({ extended: true }));
app.use(express.static(path.resolve(__dirname, 'public')));

app.use(bodyParser.json());
app.get('/datastatus', function (req, res) {

  res.status(200).json({
      message: 'sample message',
      data:[]
  });
});
app.post('/api/auth', function(req, res) {
  const body = req.body;

 
  if(body.password != 'todo') return res.sendStatus(401);
  
  var token = jwt.sign({userID: "vaibhav"}, 'todo-app-super-shared-secret', {expiresIn: '2h'});
  res.send({token});
});


app.post("/userdata", (req, res) => {
  var myData = new User(req.body);
 myData.save()
 .then(item => {
 res.send("item saved to database");
 })
 .catch(err => {
 res.status(400).send("unable to save to database");
 });
});
app.get("/people", async (request, response) => {
  try {
      var result = await User.find().exec();
      response.send(result);
  } catch (error) {
      response.status(500).send(error);
  }
});

app.get("/person/:id", async (request, response) => {
  try {
      var person = await User.findById(request.params.id).exec();
      response.send(person);
  } catch (error) {
      response.status(500).send(error);
  }
});



app.listen(4000);
