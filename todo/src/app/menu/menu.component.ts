import { Component, OnInit } from '@angular/core';
import { HarcoderServiceService } from '../service/harcoder-service.service';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  constructor(private hardcoderService: HarcoderServiceService) { }

  ngOnInit() {
  }

}
