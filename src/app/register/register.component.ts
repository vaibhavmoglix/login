import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators, } from '@angular/forms';

import { RegistrationService } from '../registration.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent {
  registerForm= this.fb.group({

    'username' : ['',[Validators.required,Validators.minLength(3)]],
    'password':['',[Validators.required,Validators.minLength(3)]],
    'firstname':['',[Validators.required]],
    'lastname':['',[Validators.required]]
  })
  constructor(private fb: FormBuilder,private _registrationService:RegistrationService) { }


  get username(){

    return  this.registerForm.get('username')
   }
 
   get password(){
 
     return this.registerForm.get('password')
   }
   get firstname(){

    return  this.registerForm.get('firstname')
   }
 
   get lastname(){
 
     return this.registerForm.get('lastname')
   }

   onSubmit(){

    console.log(this.registerForm.value)
    this._registrationService.register(this.registerForm.value)
    .subscribe(
      response=> console.log('success'),
      error=> console.log('error',error)
    ); 
   }
}



