import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Requests } from './requests';
@Injectable({
  providedIn: 'root'
})
export class RequestsService {
  baseUrl:string ="http://localhost:9191/request"
  constructor(public http:HttpClient) { }

  storeRequest(requests:any):Observable<string> {
    return this.http.post(this.baseUrl+"/apply",requests,{responseType:"text"});
  }

  findAllRequest():Observable<Requests[]> {
    return this.http.get<Requests[]>(this.baseUrl+"/viewAllRequest");
  }
  denyRequest(adharid:string):Observable<string> {
    return this.http.delete(this.baseUrl+"/deny/"+adharid,{responseType:"text"});
  }

  approvereq(request:any):Observable<string> {
    return this.http.patch(this.baseUrl+"/approve",request,{responseType:"text"});
  }

  viewmyAdhar(emailid:String):Observable<string> {
    return this.http.get(this.baseUrl+"/viewmyadhar/"+emailid,{responseType:"text"});
  }

  updateAdhar(request:any):Observable<string> {
    return this.http.patch(this.baseUrl+"/updateadhar",request,{responseType:"text"});
  }
}
