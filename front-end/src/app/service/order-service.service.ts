import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {map, Observable} from "rxjs";
import Order = jasmine.Order;

@Injectable({
  providedIn: 'root'
})
export class OrderServiceService {

  private baseUrl:string='http://localhost:8080/api/all_orders';
  constructor(private http:HttpClient) { }
  getOrder():Observable<Order[]> {
    return this.http.get<Order[]>(this.baseUrl).pipe(
        map(
        response=>response))

  }
}
