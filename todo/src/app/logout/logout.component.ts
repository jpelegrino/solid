import { Component, OnInit } from '@angular/core';
import { HarcoderServiceService } from '../service/harcoder-service.service';

@Component({
  selector: 'app-logout',
  templateUrl: './logout.component.html',
  styleUrls: ['./logout.component.css']
})
export class LogoutComponent implements OnInit {

  constructor(private hardcoderService : HarcoderServiceService) { }

  ngOnInit() {
    this.hardcoderService.logout();
  }

}
